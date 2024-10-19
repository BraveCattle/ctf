.class public final Lw/a$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lw/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field public final a:Lb0/a;

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(Lb0/a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw/a$d;->a:Lb0/a;

    iput p2, p0, Lw/a$d;->c:I

    iput p3, p0, Lw/a$d;->b:I

    return-void
.end method
