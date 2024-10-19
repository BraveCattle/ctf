.class public Lb0/e$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb0/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:I

.field public final b:[Lb0/e$c;


# direct methods
.method public constructor <init>(I[Lb0/e$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lb0/e$b;->a:I

    iput-object p2, p0, Lb0/e$b;->b:[Lb0/e$c;

    return-void
.end method
