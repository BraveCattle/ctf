.class public Landroidx/recyclerview/widget/r$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static d:Ln/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln/e<",
            "Landroidx/recyclerview/widget/r$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:I

.field public b:Landroidx/recyclerview/widget/k$g$c;

.field public c:Landroidx/recyclerview/widget/k$g$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln/e;

    const/16 v1, 0x14

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ln/e;-><init>(II)V

    sput-object v0, Landroidx/recyclerview/widget/r$a;->d:Ln/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroidx/recyclerview/widget/r$a;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Landroidx/recyclerview/widget/r$a;->a:I

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/recyclerview/widget/r$a;->b:Landroidx/recyclerview/widget/k$g$c;

    iput-object v0, p0, Landroidx/recyclerview/widget/r$a;->c:Landroidx/recyclerview/widget/k$g$c;

    sget-object v0, Landroidx/recyclerview/widget/r$a;->d:Ln/e;

    invoke-virtual {v0, p0}, Ln/e;->c(Ljava/lang/Object;)Z

    return-void
.end method
