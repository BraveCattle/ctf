.class public Lo/i;
.super Lo/e;
.source ""

# interfaces
.implements Lo/h;


# instance fields
.field public e0:[Lo/e;

.field public f0:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lo/e;-><init>()V

    const/4 v0, 0x4

    new-array v0, v0, [Lo/e;

    iput-object v0, p0, Lo/i;->e0:[Lo/e;

    const/4 v0, 0x0

    iput v0, p0, Lo/i;->f0:I

    return-void
.end method


# virtual methods
.method public a(Lo/f;)V
    .locals 0

    return-void
.end method
